class Solution:
    def threeEqualParts(self, arr):
        cnt1 = sum(arr)
        
        if cnt1==0:
            return [0,len(arr)-1]
        
        if cnt1%3!=0:
            return [-1,-1]
        
        k=cnt1//3
        
        start,mid,end = -1,-1,-1
        cnt1=0
        for i in range(len(arr)):
            if arr[i]==0:
                continue
            cnt1+=1
            if start==-1:
                start=i
            elif k+1==cnt1:
                mid=i
            elif 2*k+1==cnt1:
                end=i
                
        while end < len(arr) and arr[start] == arr[mid] and arr[mid] == arr[end]: 
            start+=1
            mid+=1
            end+=1
        
        
        if end == len(arr):
            return [start-1,mid]
        
        return [-1,-1]