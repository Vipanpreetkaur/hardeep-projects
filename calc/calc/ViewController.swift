//
//  ViewController.swift
//  calc
//
//  Created by hardeep on 2017-12-03.
//  Copyright © 2017 hardeep. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var day: UITextField!
    @IBOutlet weak var hr: UITextField!
    
    @IBOutlet weak var h: UITextField!
 
    
    @IBOutlet weak var br: UITextField!
    
    
   
    @IBOutlet weak var res: UITextField!

    
    
    @IBOutlet weak var wres: UITextField!
   
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    
    
    
    }
    
    
    
    @IBAction func cal(_ sender: UIButton) {
        
        var a  = 0.0;
        var b = 0.0;
        var bre = 0.0;
        var r = 0.0;
        var d = ""
        
        
        
        d = day.text!
        a =   Double(hr.text!)!
        b =   Double(h.text!)!
        bre =   Double(br.text!)!
       
      r = a*b-bre
        
        res.text! = "$"+String(r)+", day: "+d
        
        wres.text! = String(r)
        
        
        
        }
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

