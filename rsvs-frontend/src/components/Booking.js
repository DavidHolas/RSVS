import React, { Component } from 'react';

import { Card } from 'react-bootstrap';

class Booking extends Component {
  render() {
    return (
      <Card style={{ width: '18rem' }}>
  <Card.Img variant="top" src={this.props.image} />
  <Card.Body>
    <Card.Title>{this.props.name}</Card.Title>
    <Card.Text>
      {this.props.desc}
    </Card.Text>
    <Card.Text>
      Date: {this.props.date}
    </Card.Text>
    <Card.Text>
      Time: {this.props.time}
    </Card.Text>
  </Card.Body>
</Card>
    );
  }
}

export default Booking;
