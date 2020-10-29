import React, { Component } from 'react';
import './App.css';

import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import {Home}  from './Home';
import {Login} from './components/Login';
import {About} from './About';
import {Contact} from './Contact';
import {NoMatch} from './NoMatch';
import {Layout} from './containers/Layout';

import {NavigationBar} from './NavigationBar';
import {Jumbotron} from './containers/Jumbotron';

class App extends Component {
  render() {
    return (
      <React.Fragment>
        <Router>
        <NavigationBar />
        <Layout>
            <Switch>
              <Route exact path="/" component={Home} />
              <Route path="/login" component={Login} />
              <Route path="/about" component={About} />
              <Route path="/contact" component={Contact} />
              <Route component={NoMatch} />
            </Switch>
        </Layout>
        </Router>
      </React.Fragment>
    );
  }
}

export default App;
