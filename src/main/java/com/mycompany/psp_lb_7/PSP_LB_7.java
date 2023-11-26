package com.mycompany.psp_lb_7;

public class PSP_LB_7 {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new InsertTable().setVisible(true);
                } catch(Exception e){}
            }
        });
    }
}
