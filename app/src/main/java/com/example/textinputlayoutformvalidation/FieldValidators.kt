package com.example.textinputlayoutformvalidation

import android.util.Patterns
import java.util.regex.Pattern

/**
 * created by : Mustufa Ansari
 * Email : mustufaayub82@gmail.com
 */

object FieldValidators {

    /**
     * checking pattern of email
     * @param email input email
     * @return true if matches with email address else false
     */
    fun isValidEmail(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    /**
     * checking is string contain any number
     * @param string value to check
     * @return true if contain else false
     */
    fun isStringContainNumber(text: String): Boolean {
        val pattern = Pattern.compile(".*\\d.*")
        val matcher = pattern.matcher(text)
        return matcher.matches()
    }

    /**
     * checking if if string contain upper and lower case value
     * @param string to check
     * @return true if contain else false
     */
    fun isStringLowerAndUpperCase(text: String): Boolean {
        val lowerCasePattern = Pattern.compile(".*[a-z].*")
        val upperCasePattern = Pattern.compile(".*[A-Z].*")
        val lowerCasePatterMatcher = lowerCasePattern.matcher(text)
        val upperCasePatterMatcher = upperCasePattern.matcher(text)
        return if (!lowerCasePatterMatcher.matches()) {
            false
        } else upperCasePatterMatcher.matches()
    }

    /**
     * checking is string contain any special character
     * @param string to check
     * @return return true if contain else false.
     */
    fun isStringContainSpecialCharacter(text: String): Boolean {
        val specialCharacterPattern = Pattern.compile("[^a-zA-Z0-9 ]")
        val specialCharacterMatcher = specialCharacterPattern.matcher(text)
        return specialCharacterMatcher.find()
    }

}