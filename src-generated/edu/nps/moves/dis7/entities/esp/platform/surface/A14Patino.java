package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7661b5a
 * Country: Spain (ESP)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 19028
 */
public class A14Patino extends EntityType
{
    public A14Patino()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 19026, Auxiliary
        setSubCategory((byte)1); // uid 19027, Patino Class (Fleet Logistic Tanker) (AOR)
        setSpecific((byte)1); // uid 19028, A14 Patino
    }
}