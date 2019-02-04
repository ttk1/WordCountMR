package net.ttk1.wordcountmr;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
    @Override
    public void reduce(Text inputKey, Iterable<IntWritable> inputValues, Context context) throws IOException, InterruptedException {
        int sum = 0;
        for (IntWritable inputValue: inputValues) {
            sum += inputValue.get();
        }
        context.write(inputKey, new IntWritable(sum));
    }
}
