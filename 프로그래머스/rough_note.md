## lv. 0 

### collection 내용 정리 : https://github.com/ShonJuSeong/KB_ITs_JAVA/tree/main/10_JAVA

#### 1. contain()  
값이 특정 컬렉션이나 문자열에 포함되어 있는지 확인하는 메서드

|쓰는 곳|	의미|	예시 결과|
|:---:|:---:|:---:|
|String|	문자열 안에 어떤 글자가 포함되어 있는지	|"hello".contains("e") → true|
|List, Set	|리스트나 집합 안에 어떤 값이 들어있는지|	list.contains("apple") → true|

#### 예시

#### list 
List<String> fruits = Arrays.asList("apple", "banana", "cherry");  
System.out.println(fruits.contains("banana"));  // true  
System.out.println(fruits.contains("grape"));   // false  

#### set  
Set<String> fruitSet = new HashSet<>(fruits);  
System.out.println(fruitSet.contains("banana"));  // true  
System.out.println(fruitSet.contains("grape"));   // false  
-------------------------------------------------------------------------------------
#### 2. stream
##### 1. list, set, array와 같은 컬렉션 데이터를 반복문 없이 간결하게 처리
##### 2. for, for-each, while로 복잡하게 반복문을 돌리는 것이 비효율적일 때
##### 3. 리스트, 배열, Set, Map 등에 대해 데이터를 필터링, 변환, 정렬, 집계할 때
##### 4. 간결하고 가독성 높은 코드로 데이터를 처리하고 싶을 때

✅ 스트림 연산 종류
|종류	|메서드|	설명|
|:---:|:---:|:---:|
|시작점|stream()|	컬렉션을 스트림으로 바꿈 (데이터 흐름 시작)|	
|중간 연산	|filter()	|조건에 맞는 요소만 필터링|
|중간 연산	|map()	|요소를 다른 값으로 변환|
|중간 연산	|sorted()	|정렬|
|최종 연산	|forEach()|	요소 하나씩 출력|
|최종 연산	|count()	|개수 세기|
|최종 연산|	collect()	|리스트, 셋 등으로 다시 수집|

#### 3. filter
조건에 맞는 요소만 걸러냄
filter(조건식) 형식 
