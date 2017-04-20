package com.sysmartek.trademark.cucumber.stepdefs;

import com.sysmartek.trademark.TrademarkApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TrademarkApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
