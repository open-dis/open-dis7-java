package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@363c32cc
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 28339
 */
public class HeavyBrushTruckInternational7400 extends EntityType
{
    public HeavyBrushTruckInternational7400()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)84); // uid 24952, Single Unit Utility/Emergency Truck
        setSubCategory((byte)13); // uid 28335, Forest Fire Engine
        setSpecific((byte)3); // uid 28338, Wildland Fire Engine, Type 3
        setExtra((byte)1); // uid 28339, Heavy Brush Truck, International 7400
    }
}
