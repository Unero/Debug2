package com.example.new_sample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.longClick
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    // Button Click
    @Test
    fun all_button_number() {
        onView(withId(R.id.button1)).perform(click())
        onView(withId(R.id.input)).check(matches(withText("1")))
        onView(withId(R.id.button_clear)).perform(longClick())
        onView(withId(R.id.button2)).perform(click())
        onView(withId(R.id.input)).check(matches(withText("2")))
        onView(withId(R.id.button_clear)).perform(longClick())
        onView(withId(R.id.button3)).perform(click())
        onView(withId(R.id.input)).check(matches(withText("3")))
        onView(withId(R.id.button_clear)).perform(longClick())
        onView(withId(R.id.button4)).perform(click())
        onView(withId(R.id.input)).check(matches(withText("4")))
        onView(withId(R.id.button_clear)).perform(longClick())
        onView(withId(R.id.button5)).perform(click())
        onView(withId(R.id.input)).check(matches(withText("5")))
        onView(withId(R.id.button_clear)).perform(longClick())
        onView(withId(R.id.button6)).perform(click())
        onView(withId(R.id.input)).check(matches(withText("6")))
        onView(withId(R.id.button_clear)).perform(longClick())
        onView(withId(R.id.button7)).perform(click())
        onView(withId(R.id.input)).check(matches(withText("7")))
        onView(withId(R.id.button_clear)).perform(longClick())
        onView(withId(R.id.button8)).perform(click())
        onView(withId(R.id.input)).check(matches(withText("8")))
        onView(withId(R.id.button_clear)).perform(longClick())
        onView(withId(R.id.button9)).perform(click())
        onView(withId(R.id.input)).check(matches(withText("9")))
        onView(withId(R.id.button_clear)).perform(longClick())
        onView(withId(R.id.button0)).perform(click())
        onView(withId(R.id.input)).check(matches(withText("0")))
    }
}
