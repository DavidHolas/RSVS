package com.example.rsvs.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.rsvs.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {

    ADMIN(Sets.newHashSet(BOOKING_READ, BOOKING_WRITE, USER_READ, USER_WRITE)),
    USER(Sets.newHashSet());

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
