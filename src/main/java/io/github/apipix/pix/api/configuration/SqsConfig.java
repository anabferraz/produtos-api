//package io.github.apiprodutos.produtos.api.configuration;
//
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SqsConfig {
//
//    AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
//    ListQueuesResult lq_result = sqs.listQueues();
//System.out.println("Your SQS Queue URLs:");
//for (String url : lq_result.getQueueUrls()) {
//        System.out.println(url);
//    }
//}
