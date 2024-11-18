package test12;

public class EmployeeHours {
    public static void main(String[] args) {
        // 二维数组存储员工的每周工作时间
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        // 计算每个员工的总工作时间
        int[] totalHours = new int[8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                totalHours[i] += hours[i][j];
            }
        }

        // 按照总工作时间从高到低排序
        int[] sortedIndexes = new int[8];
        for (int i = 0; i < 8; i++) {
            sortedIndexes[i] = i;
        }
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (totalHours[sortedIndexes[i]] < totalHours[sortedIndexes[j]]) {
                    int temp = sortedIndexes[i];
                    sortedIndexes[i] = sortedIndexes[j];
                    sortedIndexes[j] = temp;
                }
            }
        }

        // 输出员工及其总工作时间
        for (int i = 0; i < 8; i++) {
            System.out.println("Employee " + sortedIndexes[i] + ": " + totalHours[sortedIndexes[i]] + " hours");
        }
    }
}