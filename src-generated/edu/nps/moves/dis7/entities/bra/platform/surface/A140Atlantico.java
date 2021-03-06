package edu.nps.moves.dis7.entities.bra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3532ec19;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32012
 */
public class A140Atlantico extends EntityType
{
    /** Default constructor */
    public A140Atlantico()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 32010, Amphibious Assault Ship
        setSubCategory((byte)1); // uid 32011, Landing Platform Helicopter (LPH)
        setSpecific((byte)1); // uid 32012, A140 Atlantico
    }
}
