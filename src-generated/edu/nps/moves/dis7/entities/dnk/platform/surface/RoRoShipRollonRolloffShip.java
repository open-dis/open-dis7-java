package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@69453e37
 * Country: Denmark (DNK)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 32976
 */
public class RoRoShipRollonRolloffShip extends EntityType
{
    public RoRoShipRollonRolloffShip()
    {
        setCountry(Country.DENMARK_DNK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24565, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)5); // uid 32976, Ro-Ro Ship (Roll-on/Roll-off Ship)
    }
}