package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@460f76a6;
 * Country: Korea (Republic of) (KOR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24579
 */
public class Kwangyang9 extends EntityType
{
    /** Default constructor */
    public Kwangyang9()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24575, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)1); // uid 24578, Common Dry Cargo Ship
        setSpecific((byte)1); // uid 24579, Kwangyang 9
    }
}
