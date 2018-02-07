#include <bits/stdc++.h>

using namespace std; 

struct node{
  node * children[26];
  
  int count; 
  
  node(){
    count = 0;
    for(int i = 0; i<26; i++)
      children[i] = NULL; 
  }
};


void add( node* n, char* s, int index){
  
    if(*s){
    int i = *s - 'a'; 
    
    if(n->children[i] == NULL){
      n->children[i] = new node();
      //cout << s[index] << endl; 
    }
    
    n->children[i]->count++; 
    return add(n->children[i], s+1, index+1); 
    }
    
    
      return; 
}


int findCount( node * n, char* s, int index){

    if(*s){
  int i = (*s - 'a');
  //cout << s[index]; 
  
  return findCount(n->children[i], s+1, index+1); 
    }
    
    
    return n->count; 
}

int main() {
   node* n = new node(); 
  
  int t;
  if(scanf("%d", &t) == 1){ 

  for(int i = 0; i<t; i++){
    //string line;
    //cin >> line; 
    char * line = new char[32]; 
    scanf("%s", line);

    add(n, line, 0);

    //cout<< findCount(n,line,0) << endl; 
    printf("%d\n", findCount(n,line,0)-1);
  }
}

  return 0; 
}
