package ru.netology.integration_testing.systemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
