//package com.example.springproject;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@ControllerAdvice //當我加上這註解，就可以在內部去使用@ExceptionHandler
//public class MyExceptionHandler {
//
//    @ExceptionHandler(RuntimeException.class)//選擇我要接的Exception
//    public ResponseEntity<String> handle(RuntimeException exception) { //參數類型要跟上面一樣
//        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
//                .body("RuntimeException:" + exception.getMessage()); //太長，所以在.前面換行
//    }
//
//    @ExceptionHandler(IllegalArgumentException.class)
//    public ResponseEntity<String> handle(IllegalArgumentException exception) {
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                .body("IllegalArgumentException:" + exception.getMessage());
//    }
//}
