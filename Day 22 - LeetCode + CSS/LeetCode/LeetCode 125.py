# Purpose: This is my final solution to LeetCode 125: Valid Palindrome
class Solution(object):
    def isPalindrome(self, s):
        left = 0
        right = len(s) - 1
        while (left < right):
            if (s[left].isalnum() == False):
                left += 1
                continue
            elif (s[right].isalnum() == False):
                right -= 1
                continue
            if (s[left].lower()==s[right].lower()):
                left+=1
                right-=1
            else:
                return False
        return True