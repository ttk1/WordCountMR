package net.ttk1.wordcountmr;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    @Override
    public void map(LongWritable inputKey, Text inputValue, Context context) throws IOException, InterruptedException {
        context.write(inputValue, new IntWritable(1));
    }
}
