package com.example.demo.validators;

import com.example.demo.domain.Part;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InventoryValidator implements ConstraintValidator<ValidInventory, Part> {

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext context) {
        if (part == null) {
            return true; // Null parts are valid (handled elsewhere if needed)
        }

        System.out.println("Validating Part in (inventoryvalidator.java):");
        System.out.println("Name: " + part.getName());
        System.out.println("Inventory: " + part.getInv() + ", Min: " + part.getMinInv() + ", Max: " + part.getMaxInv());

        if (!part.isMaxInvValid()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Minimum Inventory must be less than Maximum Inventory.")
                    .addPropertyNode("inv")
                    .addConstraintViolation();
            return false;
        }
        if (part.invLessMin()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Inventory must be more than the Minimum Inventory.")
                    .addPropertyNode("inv")
                    .addConstraintViolation();
            return false;
        }

        if (part.invGreaterMax()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Inventory must be less than the Maximum Inventory.")
                    .addPropertyNode("inv")
                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}

