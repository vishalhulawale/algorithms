package design.easy;

// 60: Apache Log — Most Frequent IP Address
// Difficulty: Hard
//
// Problem Statement: Given a web server log file where each line contains an IP address and request details, parse the log and determine the IP address(es) that accessed the site most frequently. Handle large log files efficiently. If multiple IP addresses have the same highest frequency, return all of them. This combines file parsing, hashing, and sorting concepts.
//
// Examples:
// Input:
//         "192.168.1.1 - GET /index.html"
//         "10.0.0.1 - GET /about.html"
//         "192.168.1.1 - GET /contact.html"
//         "10.0.0.1 - GET /index.html"
//         "192.168.1.1 - POST /login"
// Output: "192.168.1.1"  (3 accesses)
//
// Input: Log with tied frequencies
// Output: All tied IPs

// TC: O(n) where n is the number of lines in the log file
// SC: O(m) where m is the number of unique IP addresses in the log file
// This approach was Hashmap + streaming parse

// Advanced approach 1: Chunk processing for large files, then merge
// Advanced approach 2: External Sorting. Used in Hadoop-style processing.
// Advanced approach 3: Distributed map-reduce style processing for very large logs across multiple machines.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogProcessor {

    public static List<String> findFrequentIps(String filePath) throws IOException {
        Map<String, Integer> ipFrequency = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        int max = 0;

        String line;
        while ((line = reader.readLine()) != null) {
            String ip = extractIP(line);
            int count = ipFrequency.getOrDefault(ip, 0) + 1;
            ipFrequency.put(ip, count);
            max = Math.max(count, max);
        }
        reader.close();

        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : ipFrequency.entrySet()) {
            if (entry.getValue() == max) {
                res.add(entry.getKey());
            }
        }

        return res;
    }

    private static String extractIP(String line) {
        return line.split(" ")[0];
    }

    public static void main(String[] args) throws IOException {
        List<String> result1 = findFrequentIps("C:\\Workspace\\algorithms\\design\\hard\\log.txt");
        System.out.println(result1);
    }
}
