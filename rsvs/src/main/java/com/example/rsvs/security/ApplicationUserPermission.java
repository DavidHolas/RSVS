package com.example.rsvs.security;

public enum ApplicationUserPermission {

    USER_READ("user:read"),
    USER_WRITE("user:write"),
    BOOKING_READ("booking:read"),
    BOOKING_WRITE("booking:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
