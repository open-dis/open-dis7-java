package edu.nps.moves.dis7.entities.prk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@fd46303;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17814
 */
public class _201Sohai extends EntityType
{
    /** Default constructor */
    public _201Sohai()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17801, Auxiliary
        setSubCategory((byte)2); // uid 17811, Surveying Ship
        setSpecific((byte)3); // uid 17814, 201 Sohai
    }
}
