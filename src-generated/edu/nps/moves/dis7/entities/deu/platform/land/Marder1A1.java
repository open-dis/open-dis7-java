package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b520ea8;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22725
 */
public class Marder1A1 extends EntityType
{
    /** Default constructor */
    public Marder1A1()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 16250, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 16251, Marder 1
        setSpecific((byte)1); // uid 22725, Marder 1 A1
    }
}
