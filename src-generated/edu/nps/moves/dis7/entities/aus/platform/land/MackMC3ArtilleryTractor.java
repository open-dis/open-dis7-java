package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c8da962;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31288
 */
public class MackMC3ArtilleryTractor extends EntityType
{
    /** Default constructor */
    public MackMC3ArtilleryTractor()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)6); // uid 31284, Mack MC3 6x6 Heavy Utility Truck
        setSpecific((byte)4); // uid 31288, Mack MC3 Artillery Tractor
    }
}
