#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
using namespace std;
priority_queue<int,vector<int>,less<int> >my_q;// 1 �̻��� ��, ū�ͺ��� ������ 
priority_queue<int,vector<int>,greater<int> >my_q2;// 0������ �� , ���� �� ���� ������  

int main() {
	long long int sum =0;//sum�� ���� �� ũ�� �ڷ����� ũ��  
	int N; cin>>N;
	while(N--){
	int input;
	cin>>input;
	if(input>0){
	my_q.push(input);	
	}
	else{
	my_q2.push(input);		
	}
	}
	while(!my_q.empty()){
		int temp = my_q.top(); my_q.pop();
		if(my_q.empty()){
				sum +=temp;// �ϳ��� ������ ���ϰ� 
				break;
		}
		int temp2= my_q.top();
		my_q.pop();
		if(temp2 ==1){
		sum +=(temp+temp2);	// �ٸ� ���Ҷ� 1�� ���, ���ϴ� ���� �� ����. 2+1 =3, 2*1 =2
		}
		else{
			sum +=(temp*temp2);// �ΰ� �� ������ ���Ѵ�. 
		}
	}
	// ���� �κе� ���� ����. 
	while(!my_q2.empty()){
		int tmp = my_q2.top();my_q2.pop(); 
		if(my_q2.empty()){
				sum +=tmp;
				break;
		}
		int tmp2= my_q2.top();
		my_q2.pop();
		sum +=(tmp*tmp2);
	}
	cout<<sum<<'\n';
	return 0;
}
