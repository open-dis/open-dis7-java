package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d5620ce;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 29358
 */
public class MANSX458x8 extends EntityType
{
    /** Default constructor */
    public MANSX458x8()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 16279, Large Wheeled Utility Vehicle (greater than 1.25 tons)
        setSubCategory((byte)10); // uid 29357, MAN SX45 Series
        setSpecific((byte)1); // uid 29358, MAN SX45 - 8x8
    }
}
