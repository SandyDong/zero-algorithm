package com.dong.code_youhua;

public enum RoleOperationImpl implements RoleOperation {

    ROLE_ADMIN{
        @Override
        public String operate() {
            return "admin";
        }
    },

    ROLE_ORDER{
        @Override
        public String operate() {
            return "order";
        }
    },

    ROLE_UNUSAL{
        @Override
        public String operate() {
            return "unusal";
        }
    },
}
