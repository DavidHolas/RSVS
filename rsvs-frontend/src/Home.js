import React from 'react';

import Booking from './components/Booking';
import BookingList from './containers/BookingList';

export const Home = () => (
    <div>
        <h2>RSVS</h2>
        <Booking name="BJJ Training" image="assets\/bjj-rsvs.jpg" desc="Choke for life" date="20.října 2020" time="19:00 - 20:30" />
        <Booking name="MMA" image="assets\/mma-rsvs.jpg" desc="Become a real fighter" date="21.října 2020" time="19:00 - 20:30"/>
    </div>
)