document distance is the angle which shows the similarity between the two documents.
1. get rid of punctuation. 
2. convert everything to lower case split into arrays of words for both the document.
3. make a dictionary  and keep the frequency of the words i.e the vector data.
4. find the dot product of both vectors divide them by square root of product of length of both vectors.  
5. take arccos of the value to get the angle which is in radians convert to degree. 
6. 0 degree means both the document are identical , 90 degree means both the documents don't share any words.
