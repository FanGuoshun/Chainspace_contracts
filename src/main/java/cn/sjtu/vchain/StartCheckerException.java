package cn.sjtu.vchain;

class StartCheckerException extends Exception {

    StartCheckerException(String message) {

        super("[ERROR_STARTCHECKER] " + message);
    }

    public StartCheckerException(String message, Exception e) {
        super("[ERROR_STARTCHECKER] " + message, e);
    }
}
