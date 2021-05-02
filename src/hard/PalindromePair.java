package src.hard;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Problem URL: https://www.geeksforgeeks.org/palindrome-pair-in-an-array-of-words-or-strings/
 * <p>
 * BigO = O(nk^2), where n = number of words in the list & k = maximum length that is checked for palindrome
 */
public class PalindromePair {

    static final int ALPHABET_SIZE = 26;

    static List<List<Integer>> result;

    public static void main(String[] args) {

        List<String> strings = asList("geekf", "geeks", "or", "keeg", "abc", "bc");

        if (checkPalindromePair(strings)) System.out.println("Yes");
        else System.out.println("No");
    }

    static boolean checkPalindromePair(List<String> strings) {

        TrieNode root = new TrieNode();
        for (int i = 0; i < strings.size(); i++) insert(root, strings.get(i), i);

        result = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            search(root, strings.get(i), i);
            if (result.size() > 0) return true;
        }

        return false;
    }

    static void insert(TrieNode root, String key, int id) {

        TrieNode pCrawl = root;

        for (int level = key.length() - 1; level >= 0; level--) {
            int index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null) pCrawl.children[index] = new TrieNode();
            if (isPalindrome(key, 0, level)) (pCrawl.pos).add(id);
            pCrawl = pCrawl.children[index];
        }

        pCrawl.id = id;
        pCrawl.pos.add(id);
        pCrawl.isLeaf = true;
    }

    static boolean isPalindrome(String str, int index, int len) {

        while (index < len) {
            if (str.charAt(index) != str.charAt(len)) return false;
            index++;
            len--;
        }

        return true;
    }

    static void search(TrieNode root, String key, int id) {

        TrieNode pCrawl = root;

        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (pCrawl.id >= 0 && pCrawl.id != id && isPalindrome(key, level, key.length() - 1)) {
                List<Integer> l = new ArrayList<>();
                l.add(id);
                l.add(pCrawl.id);
                result.add(l);
            }

            if (pCrawl.children[index] == null) return;
            pCrawl = pCrawl.children[index];
        }

        for (int i : pCrawl.pos) {
            if (i == id) continue;
            List<Integer> l = new ArrayList<>();
            l.add(id);
            l.add(i);
            result.add(l);
        }

    }

    static class TrieNode {

        int id;
        boolean isLeaf;
        List<Integer> pos;
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        public TrieNode() {
            isLeaf = false;
            pos = new ArrayList<>();
            for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
        }
    }

}
