class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root==null)
        {
            return ans;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            int s = q.size();
            
            List<Integer> l = new ArrayList<>();
            
            for(int i=0;i<s;i++)
            {
                TreeNode rem = q.remove();
                
                l.add(rem.val);
                
                if(rem.left!=null)
                {
                    q.add(rem.left);
                }
                
                if(rem.right!=null)
                {
                    q.add(rem.right);
                }
            }
            
            ans.add(l);
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}
