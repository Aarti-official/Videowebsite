package com.example.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ErrorUtil {
//    private List<String> errorMessages;
//    public ErrorUtil(){
//        errorMessages = new ArrayList<>();
//    }
//        public void addErrorMessage(String errorMessage) {
//            errorMessages.add(errorMessage);
//        }
//        public List<String> getErrorMessages(){
//        return errorMessages;
//        }
	
    private Set<String> errorMessages;

    public ErrorUtil() {
        errorMessages = new HashSet<>();
    }

    public void addErrorMessage(String errorMessage) {
        errorMessages.add(errorMessage);
    }

    public boolean containsErrorMessage(String errorMessage) {
        return errorMessages.contains(errorMessage);
    }
    }