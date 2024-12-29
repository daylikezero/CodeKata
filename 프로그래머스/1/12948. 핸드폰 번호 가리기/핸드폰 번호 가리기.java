class Solution {
    public String solution(String phone_number) {
        String answer = phone_number.substring(0, phone_number.length()-4);
        String code = "*".repeat(answer.length());
        phone_number = phone_number.replaceAll(answer, code);
        return phone_number;
    }
}