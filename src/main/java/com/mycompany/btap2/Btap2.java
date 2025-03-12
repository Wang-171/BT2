/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.btap2;

/**
 *
 * @author quang
 */
public class Btap2 {

    private String userId;
    private String email;

    public Btap2(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

}
