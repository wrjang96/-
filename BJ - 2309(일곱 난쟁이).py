from itertools import combinations
N = 9
arr =[]
while N :
    temp = int(input())
    arr.append(temp)
    N -= 1

temp_arr = list(combinations(arr,7))
for i in range(len(temp_arr)):
    if sum(temp_arr[i]) == 100:
        answer = sorted(temp_arr[i])
        for j in range(len(answer)):
            print(answer[j])
        break