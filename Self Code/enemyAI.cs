using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class EnemyAI : MonoBehavior
{
    
    public Transform target;
    public float speed = 200f;
    public float nextWaypointDistance = 4f;
    public float FOV = 50f;
    public Transform enemyGFX;
    
    Path path;
    int currentWaypoint = 0;
    bool reachedEndOfPath = false;
    
    Seeker seeker;
    Rigidbody2D rb;
    
    void Start()
    {
        seeker = GetComponent<Seeker>();
        rb = GetComponent<RigidBody2D>();
        
        InvokeRepeating("UpdatePath", 0f, .5f);
        
    }
    
    void UpdatePath()
    {
        var distance = Vector3.Distance(objectOne, objectTwo);
        if(distance > FOV){
            if(seeker.IsDone()){
                seeker.StartPath(rb.position, target.position, OnPathComplete);
            }
        }

    }
    
    void OnPathComplete(Path p){
        if(!p.error)
        {
            path = p;
            currentWaypoint = 0;
        }
    }
    
    void FixedUpdate()
    {
        if(path == null)
            return;
        
        if(currentWaypoint >= path.vectorPath.Count){
            reachedEndOfPath = true;
            return;
        }
        else{
            reachedEndOfPath = false;
        }
        
        Vector2 direction = (path.vectorPath[currentWaypoint] - rb.position).normalized;
        Vector2 force = direction * speed * Time.deltaTime;
        
        rb.Addforce(force);
        
        float distance = Vector2.Distance(rb.position, path.vectorPath[currentWaypoint]);
        
        if(distance < nextWaypointDistance){
            currentWaypoint++;
        }
    
        if(force.x >= 0.01f){
            enemyGFX.localScale = new Vector3(-1f,1f,1f);
        }
        else if(force.x <= -0.01f){
            enemyGFK.localScale = new Vector3(1f,1f,1f);
        }
        
    }
}