package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7164ca4c;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27588
 */
public class RoRoShipRollonRolloffShip extends EntityType
{
    /** Default constructor */
    public RoRoShipRollonRolloffShip()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 27585, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)5); // uid 27588, Ro-Ro Ship (Roll-on/Roll-off Ship)
    }
}
