https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1

class Solution
{
    public:
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    vector<int> topView(Node *root)
    {
        //Your code here
        queue<pair<Node*, int>> q;
        q.push({root, 0});
        vector<int> res;
        map<int, int> mp;
        
        while(!q.empty())
        {
            Node* node = q.front().first;
            int dist = q.front().second;
            q.pop();
            
            if(!mp[dist])
            {
                mp[dist] = node->data;
            }
            
            if(node->left)
            {
                q.push({node->left, dist-1});
            }
            if(node->right)
            {
                q.push({node->right, dist+1});
            }
        }
        
        for(auto it:mp)
        {
            res.push_back(it.second);
        }
        return res;
    }

};