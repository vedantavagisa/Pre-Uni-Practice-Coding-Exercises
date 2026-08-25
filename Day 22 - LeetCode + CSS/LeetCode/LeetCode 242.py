# Purpose: This is my final solution to LeetCode 242: Valid Anagram
class Solution(object):
    def isAnagram(self, s, t):
        tsort = "".join(sorted(t))
        ssort = "".join(sorted(s))
        return tsort == ssort