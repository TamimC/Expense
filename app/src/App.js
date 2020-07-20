import React from 'react';
import {BrowserRouter as Router, Switch, Route} from 'react-router-dom'
import './App.css';
import Category from './Category';
import Home from './Home'
import Expenses from './Expenses'

function App() {
  return (
    <Router>
      <Switch>
        <Route path = '/' exact = {true} component = {Home}/>
        <Route path = '/categories' exact = {true} component = {Category}/>
        <Route path = '/expenses' exact = {true} component = {Expenses}/>
        <Route/>
      </Switch>
    </Router>
  );
}

export default App;
