package com.example.unittestingdemo;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.EspressoException;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest
public class MainActivityUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testTextChange(){
        Espresso.onView(withId(R.id.etInput))
                .perform(typeText("Hello"));
        Espresso.onView(withId(R.id.btnSendInput))
                .perform(click());
        Espresso.onView(withId(R.id.tvOutput)).check(matches(withText("Hello")));
    }
}
