package com.ugb.mIPrimerAplicacion;


import androidx.annotation.NonNull;

import java.util.concurrent.CompletableFuture;

import kotlinx.coroutines.scheduling.Task;

public class Token {
    public String obtenerToken(){
        CompletableFuture<String> tarea = new CompletableFuture<>();
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
            @Override
            public void onComplete(@NonNull Task<String> task) {
                if( task.isSuccessful() ){
                    String token = task.getResult();
                    tarea.complete(token);
                }else{
                    tarea.completeExceptionally(task.getException());
                }
            }
        });
        try{
            return tarea.get();
        }catch (Exception e){
            return e.getMessage();
        }
    }
}