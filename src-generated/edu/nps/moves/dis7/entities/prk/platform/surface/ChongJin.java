package edu.nps.moves.dis7.entities.prk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@79e18e38;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17821
 */
public class ChongJin extends EntityType
{
    /** Default constructor */
    public ChongJin()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)61); // uid 17819, Non-combatant ship
        setSubCategory((byte)1); // uid 17820, Container class
        setSpecific((byte)1); // uid 17821, Chong Jin
    }
}
