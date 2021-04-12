package com.ardamuh;

public class Main {

    public static void main(String[] args) {
        char[][] answer = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        char[] keyAnswer = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int students = 8, questions = 10;
        int[] result = new int[students];

        for(int i=0; i<students; ++i) {
            int countAnswers = 0;
            for(int j=0; j<questions; ++j) {
                if(answer[i][j] == keyAnswer[j]) {
                    countAnswers++;
                }
                result[i] = countAnswers;
            }
            System.out.println("Mhs " + i + " jumlah jawaban yang benar adalah " + result[i]);
        }
    }
}
