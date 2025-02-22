
request mapping
1.put -http://localhost:8081/blog/putdata
payload-
{ "id":3,
 "firstName": "30",
 "lastName": "30",
 "contact": {
 "email": "3@0.com",
 "phone_number": "30"
},
 "blog" :[
 
  {   "blog_id": 2, -> send the primary key id field which you wanted to update,
      "blogDetails":"6 is my new updated blog"
   }
 ] 
 
2. post - http://localhost:8081/blog/postdata
    payload-
	{ "id":3,
 "firstName": "30",
 "lastName": "30",
 "contact": {
 "email": "3@0.com",
 "phone_number": "30"
},
 "blog" :[
 
  {  
      "blogDetails":"6 is my new updated blog"
   }
 ] 

remaining workk
Exception handeling
DTO
