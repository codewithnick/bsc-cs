def selection_sort(alist):
    for i in range(0,len(alist)-1):
        smallest=i
        print('\nCurrent Index')
        print(i)
        for j in range(i+1,len(alist)):
            if alist[j]<alist[smallest]:
                smallest=j;
                print('Next Elements Index:')
        alist[i],alist[smallest]=alist[smallest],alist[i]
        print(alist)


alist=input('Enter the list of number').split()
alist=[int(x) for x in alist]
selection_sort(alist)
print('\nSoreted List:',end='')
print(alist)
print('Smallest Number in your given list is:')
print(alist[0])
print('Biggest Number in your given list is:')
print(alist[-1])
                                                                                                                                                                      