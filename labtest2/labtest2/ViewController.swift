//
//  ViewController.swift
//  labtest2
//
//  Created by hardeep on 2017-11-25.
//  Copyright © 2017 hardeep. All rights reserved.

import UIKit
import MapKit
class ViewController: UIViewController {

    @IBOutlet weak var loc: UITextField!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    @IBOutlet weak var mapl: MKMapView!
    
    @IBAction func search(_ sender: UIButton) {
        
        
        
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

