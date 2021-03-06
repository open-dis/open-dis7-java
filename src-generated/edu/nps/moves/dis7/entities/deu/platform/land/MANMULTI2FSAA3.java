package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@700fb871;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28072
 */
public class MANMULTI2FSAA3 extends EntityType
{
    /** Default constructor */
    public MANMULTI2FSAA3()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 16279, Large Wheeled Utility Vehicle (greater than 1.25 tons)
        setSubCategory((byte)6); // uid 28070, MULTI
        setSpecific((byte)2); // uid 28072, MAN MULTI 2 FSA A3
    }
}
