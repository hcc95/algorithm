package com.cdut.sort;

public class SelectSort {
	public static void selectSort(DataWrap[] data){
		System.out.println("开始排序");
		int arrayLength=data.length;
		//依次进行n-1趟比较，第i趟比较将第i大的值选出放在i位置
		for(int i=0;i<arrayLength-1;i++){
			//第i个数据只需和它后面的数据比较
			for(int j=i+1;j<arrayLength;j++){
				//如果第i位置的数据>j位置的数据，交换它们
				if(data[i].compareTo(data[j])>0){
					DataWrap temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
			System.out.println(java.util.Arrays.toString(data));
		}
	}
	public static void selectSort2(DataWrap[] data){
		System.out.println("开始排序");
		int arrayLength=data.length;
		//依次进行n-1趟比较，第i趟比较将第i大的值选出放在i位置
		for(int i=0;i<arrayLength-1;i++){
			int minIndex=i;
			//第i个数据只需和它后面的数据比较
			for(int j=i+1;j<arrayLength;j++){
				//如果第i位置的数据>j位置的数据
				if(data[i].compareTo(data[j])>0){
					//将j的值赋给minIndex
					minIndex=j;
				}
			}
			//每趟比较最多交换一次
			if(minIndex!=i){
				DataWrap temp=data[i];
				data[i]=data[minIndex];
				data[minIndex]=temp;
			}
			System.out.println(java.util.Arrays.toString(data));
		}
	}
	
	
	public static void main(String[] args) {
		DataWrap[] data={
				new DataWrap(21, ""),
				new DataWrap(30, ""),
				new DataWrap(49, ""),
				new DataWrap(30, "*"),
				new DataWrap(16, ""),
				new DataWrap(9, "")
		};
		System.out.println("排序前\n"+java.util.Arrays.toString(data));
		selectSort2(data);
		System.out.println("排序后\n"+java.util.Arrays.toString(data));
	}
}

